using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(program10.Startup))]
namespace program10
{
    public partial class Startup {
        public void Configuration(IAppBuilder app) {
            ConfigureAuth(app);
        }
    }
}
