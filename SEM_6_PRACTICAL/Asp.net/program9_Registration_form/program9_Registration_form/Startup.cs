using Microsoft.Owin;
using Owin;

[assembly: OwinStartupAttribute(typeof(program9_Registration_form.Startup))]
namespace program9_Registration_form
{
    public partial class Startup {
        public void Configuration(IAppBuilder app) {
            ConfigureAuth(app);
        }
    }
}
