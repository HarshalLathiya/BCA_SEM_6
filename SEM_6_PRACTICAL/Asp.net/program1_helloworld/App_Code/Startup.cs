using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(program1_helloworld.Startup))]
namespace program1_helloworld
{
    public partial class Startup {
        public void Configuration(IAppBuilder app) {
            ConfigureAuth(app);
        }
    }
}
